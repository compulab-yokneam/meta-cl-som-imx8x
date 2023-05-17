FILESEXTRAPATHS:prepend := "${THISDIR}/cl-som-imx8x:"

SRC_URI:append = " \
	file://0001-cmd-eeprom-fix-disregarding-of-the-i2c_bus-parameter.patch	\
	file://0002-eeprom-layout-remove-buf-from-the-eeprom_field-struc.patch	\
	file://0003-eeprom-layout-add-field-functions-read.patch		\
	file://0004-compulab-eeprom-layout-add-read-serial-function.patch	\
	file://0005-compulab-eeprom-layout-add-layout-setup-function.patch	\
	file://0006-compulab-eeprom-layout-support-layout-version-4.patch	\
	file://0007-compulab-eeprom-layout-forward-compatibility.patch		\
	file://0008-compulab-integrate-DM_I2C-in-EEPROM-driver.patch		\
	file://0009-compulab-eeprom-Add-DM-support.patch			\
	file://0010-cl-som-imx8x-Add-CL-SOM-iMX8X-board-to-U-Boot.patch		\
	file://0011-Release-cl-som-imx8x-2.0.patch				\
	file://0012-cl-som-imx8x-config-Enable-UUU-support.patch		\
	file://0013-cl-som-imx8x-config-Fix-console-issue.patch			\
	file://0014-cl-som-imx8x-config-Update-default-boot-environment.patch	\
"
