# Quick Start Guide

|NOTE|This is a development branch for demo purpose only !!!|
|---|---|


Supported CompuLab machines:
* `cl-som-imx8x`

# 1 Setup environment
## 1.1 Prepare NXP BSP
```
repo init -u https://github.com/nxp-imx/imx-manifest.git -b imx-linux-zeus -m imx-5.4.70-2.3.0.xml
repo sync
```
## 1.2 Download CompuLab meta layer
```
git clone -b devel https://github.com/compulab-yokneam/meta-cl-som-imx8x.git sources/meta-cl-som-imx8x/
```

# 2 Build
## 2.1 Define COMPULAB_MACHINE environment variable
```export COMPULAB_MACHINE=cl-som-imx8x```

## 2.2 Run CompuLab Linux Yocto Project setup
|NOTE|Refer to the [NXP Readme](https://github.com/nxp-imx/meta-imx/blob/zeus-5.4.70-2.3.0/README) for details about how to select a correct backend & distro.|
|---|---|
```

MACHINE=${COMPULAB_MACHINE} DISTRO=fsl-imx-xwayland source sources/meta-cl-som-imx8x/tools/setup-cl-som-imx8x-env -b build-xwayland
```
## 2.3 Build image
```
bitbake -k cl-som-imx8x-eval
```
## 2.4 Build bootloader only
|U-Boot Location|`conf/local.conf` string to add|file name|
|---|---|---|
| SD | UBOOT_CONFIG = "sd" | imx-boot-cl-som-imx8x-sd.bin-imx-boot-cl-som-imx8x-sd.bin|
| flexspi | UBOOT_CONFIG = "sf" | imx-boot-cl-som-imx8x-sf.bin-imx-boot-cl-som-imx8x-sf.bin|
```
bitbake -k imx-boot
```
