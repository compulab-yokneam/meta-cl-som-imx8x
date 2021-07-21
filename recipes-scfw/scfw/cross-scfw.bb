# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# WARNING: the following LICENSE and LIC_FILES_CHKSUM values are best guesses - it is
# your responsibility to verify that the values are complete and correct.
#
# The following license files were not able to be identified and are
# represented as "Unknown" below, you will need to check them yourself:
#   share/doc/gcc-arm-none-eabi/license.txt
#   share/doc/gcc-arm-none-eabi/html/cpp/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/gdb/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/gcc/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/gprof.html/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/ld.html/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/annotate/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/as.html/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/stabs/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/bfd.html/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/binutils.html/GNU-Free-Documentation-License.html
#   share/doc/gcc-arm-none-eabi/html/gccint/GNU-Free-Documentation-License.html
LICENSE = "Unknown"
LIC_FILES_CHKSUM = "file://share/doc/gcc-arm-none-eabi/license.txt;md5=c18349634b740b7b95f2c2159af888f5 \
                    file://share/doc/gcc-arm-none-eabi/html/cpp/GNU-Free-Documentation-License.html;md5=706cc0ee111f9bac0eca6d3f95e51ab3 \
                    file://share/doc/gcc-arm-none-eabi/html/gdb/GNU-Free-Documentation-License.html;md5=7f2fe793f740dfdc3d843e7d3a691227 \
                    file://share/doc/gcc-arm-none-eabi/html/gcc/GNU-Free-Documentation-License.html;md5=7a83c0043c81e94be5dfa04b8c7467f8 \
                    file://share/doc/gcc-arm-none-eabi/html/gprof.html/GNU-Free-Documentation-License.html;md5=1922aad1853586f6e88553d5b5e50cd5 \
                    file://share/doc/gcc-arm-none-eabi/html/ld.html/GNU-Free-Documentation-License.html;md5=e8ecf3afc169ed4c9adbf9c1a4e38be3 \
                    file://share/doc/gcc-arm-none-eabi/html/annotate/GNU-Free-Documentation-License.html;md5=a5435a86dd17e02f9c173f1f867ad127 \
                    file://share/doc/gcc-arm-none-eabi/html/as.html/GNU-Free-Documentation-License.html;md5=e96c958ea04213056ba75c3c9ed0dfcc \
                    file://share/doc/gcc-arm-none-eabi/html/stabs/GNU-Free-Documentation-License.html;md5=c56e17ca8952e86d16e91244f1f85ce0 \
                    file://share/doc/gcc-arm-none-eabi/html/bfd.html/GNU-Free-Documentation-License.html;md5=47dd172e02b4ed892295494a3c2337be \
                    file://share/doc/gcc-arm-none-eabi/html/binutils.html/GNU-Free-Documentation-License.html;md5=434ac75049610dc19ae72a5c636676d3 \
                    file://share/doc/gcc-arm-none-eabi/html/gccint/GNU-Free-Documentation-License.html;md5=fd43d1369f75ce5337f84e9ae286c89b"

SRC_URI = "https://developer.arm.com/-/media/Files/downloads/gnu-rm/10-2020q4/gcc-arm-none-eabi-10-2020-q4-major-x86_64-linux.tar.bz2"
SRC_URI[md5sum] = "8312c4c91799885f222f663fc81f9a31"
SRC_URI[sha1sum] = "a9a1155910260500011b6fb32e720e804fe59428"
SRC_URI[sha256sum] = "21134caa478bbf5352e239fbc6e2da3038f8d2207e089efc96c3b55f1edcd618"
SRC_URI[sha384sum] = "3b2847dd8647aed5167fc183696b9a99e8bea2f392fd52ab1453b34bdedff314631a2019f1b83c5c1219b8533a05ade1"
SRC_URI[sha512sum] = "62671793e812389fd667669d1894c9a01433f143a8c91a551f034b3fa550167daeefdae29c240734c6a44ec80a00c3ce01b108a33aab92d034ef2a81efff1c13"

S = "${WORKDIR}/gcc-arm-none-eabi-10-2020-q4-major"

# NOTE: no Makefile found, unable to determine what needs to be done
inherit deploy

do_configure () {
	# Specify any needed configure commands here
	:
}

do_compile () {
	# Specify compilation commands here
	:
}

do_install () {
	# Specify install commands here
	:
}

do_deploy() {
	# NOTE: unable to determine what to put here - there is a Makefile but no
	# target named "install", so you will need to define this yourself
	cp -a ${S} ${DEPLOY_DIR_IMAGE}/gcc-arm-none-eabi
}

addtask deploy after do_compile
