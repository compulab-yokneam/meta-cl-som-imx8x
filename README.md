# Quick Start Guide

|NOTE|This is a development branch for demo purpose only !!!|
|---|---|


Supported CompuLab machines:
* `cl-som-imx8x`

# 1 Setup environment
## 1.1 Prepare NXP BSP
```
repo init -u git://github.com/nxp-imx/imx-manifest.git -b imx-linux-kirkstone -m imx-5.15.71-2.2.0.xml
repo sync
```
## 1.2 Download CompuLab meta layer
```
git clone -b devel-C0 https://github.com/compulab-yokneam/meta-cl-som-imx8x.git sources/meta-cl-som-imx8x/
```

# 2 Build
## 2.1 Define COMPULAB_MACHINE environment variable
|Revision | Yocto machine |
|---|---|
|B0| ```export COMPULAB_MACHINE=cl-som-imx8xb0```|
|C0| ```export COMPULAB_MACHINE=cl-som-imx8xc0```|

## 2.2 Run CompuLab Linux Yocto Project setup
|NOTE|Refer to the [NXP Readme](https://github.com/nxp-imx/meta-imx/blob/kirkstone-5.15.71-2.2.0/README) for details about how to select a correct backend & distro.|
|---|---|
```

MACHINE=${COMPULAB_MACHINE} DISTRO=fsl-imx-xwayland source sources/meta-cl-som-imx8x/tools/setup-cl-som-imx8x-env -b build-${COMPULAB_MACHINE}
```
## 2.3 Build bootloader only
|U-Boot Location|`conf/local.conf` string to add|file name|
|---|---|---|
| SD | UBOOT_CONFIG = "sd" | imx-boot-cl-som-imx8x-sd.bin-flash_spl |
| flexspi | UBOOT_CONFIG = "fspi" | imx-boot-cl-som-imx8x-fspi.bin-flash_spl_flexspi |
```
bitbake -k imx-boot
```
