do_install_append () {
	rm -rf ${D}/sbin

	install -d ${D}/etc/
	install -m 0644 ${S}/tools/env/fw_env.config  ${D}/etc/fw_env.config

	install -d ${D}/usr/local/bin
	install -m 0755 ${S}/tools/env/fw_printenv ${D}/usr/local/bin/fw_printenv
	install -m 0755 ${S}/tools/env/fw_printenv ${D}/usr/local/bin/fw_setenv
}

FILES_${PN} = "/etc/* /usr/local/bin/*"
