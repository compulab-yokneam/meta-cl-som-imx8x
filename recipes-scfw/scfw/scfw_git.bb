LICENSE = "NXP-Binary-EULA"
LIC_FILES_CHKSUM = "file://COPYING;md5=a632fefd1c359980434f9389833cab3a"

SRC_URI = "git://github.com/compulab-yokneam/scfw.git;protocol=https;branch=master"

PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

inherit deploy

SC_FIRMWARE_NAME = "build_mx8qx_b0/scfw_tcm.bin"
SC_FIRMWARE_NAME_ST = "mx8qxb0_scfw_download.bin"
LDEPLOY = "DEPLOY"
RDEPLOY = "/opt/soc/scfw"

BOOT_TOOLS = "imx-boot-tools"

do_configure() {
	oe_runmake clean
	rm -rf ${S}/${LDEPLOY}
	mkdir -p ${S}/${LDEPLOY}
}

do_compile() {
	export CROSS_COMPILE=${DEPLOY_DIR_IMAGE}/gcc-arm-none-eabi/bin/arm-none-eabi-

	oe_runmake clean
	oe_runmake SOC=MX8QX B=clsom R=B0 D=1 M=1 DL=5 V=0 qx
	cp ${S}/${SC_FIRMWARE_NAME} ${S}/${LDEPLOY}/
}

do_install() {
	install -d ${D}/${RDEPLOY}
	for fw_file in ${S}/${LDEPLOY}/* ;do
		install -Dm 0644 ${fw_file} ${D}/${RDEPLOY}/
	done
}

do_deploy() {
	mkdir -p ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/
	for fw_file in ${S}/${LDEPLOY}/* ;do
		install -Dm 0644 ${fw_file} ${DEPLOY_DIR_IMAGE}/${BOOT_TOOLS}/
	done
}

addtask deploy after do_compile

FILES_${PN} = " \
	${RDEPLOY}/* \
"

PACKAGE_ARCH = "${MACHINE_ARCH}"
DEPENDS = "cross-scfw"
