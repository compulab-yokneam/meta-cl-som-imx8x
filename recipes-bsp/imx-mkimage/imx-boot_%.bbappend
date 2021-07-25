FILESEXTRAPATHS_prepend := "${THISDIR}/cl-som-imx8x:"

SRC_URI_append = " file://0001-Add-build-targets-for-CL-SOM-iMX8X.patch"

IMX_BOOT_IMG_NAME = "${BOOT_NAME}-${MACHINE}-${UBOOT_CONFIG}"
IMX_BOOT_IMG_NAME_LONG = "${BOOT_CONFIG_MACHINE}-${target}"

IMXBOOT_TARGET = "imx-boot-cl-som-imx8x-sf"
IMXBOOT_TARGET_SF = "${IMXBOOT_TARGET}.bin"

do_install () {
    install -d ${D}/boot
    for target in ${IMXBOOT_TARGETS}; do
        install -m 0644 ${S}/${IMX_BOOT_IMG_NAME_LONG} ${D}/boot/${IMX_BOOT_IMG_NAME}
    done
    make SOC=iMX8QX  ${IMXBOOT_TARGET_SF}
    install -m 0644 ${S}/iMX8QX/${IMXBOOT_TARGET_SF} ${D}/boot/${IMXBOOT_TARGET}
}
