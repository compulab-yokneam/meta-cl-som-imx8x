# U-Boot #
UBOOT_CONFIG ?= "sd"
UBOOT_CONFIG[sd] = "cl-som-imx8x_defconfig,sdcard"
UBOOT_CONFIG[fspi] = "cl-som-imx8x_defconfig"

# Kernel #
KERNEL_DEVICETREE =  "compulab/cl-som-imx8x.dtb "
KERNEL_DEVICETREE += "compulab/sb-imx8x.dtb "

# Firmware Images #
MACHINE_FIRMWARE = " linux-firmware-iwlwifi-8265"
MACHINE_FIRMWARE += " linux-firmware-ibt"
