DESCRIPTION = "Package that provides access to GPIO and other IO\
functions on the Broadcom BCM 2835 chip, allowing access to the\
GPIO pins on the 26 pin IDE plug on the RPi board"
SECTION = "base"
HOMEPAGE = "http://github.com/i4tv/gstreamill"
AUTHOR = "Zhang Ping (dqzhangp@163.com)"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

COMPATIBLE_MACHINE = "raspberrypi"

SRCREV = "bc52bb57a51624565cd5de2148c70883f0a3e286"
SRC_URI = "git://github.com/i4tv/gstreamill.git;protocol=http;branch=master"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

FILES_${PN} = ""
FILES_${PN}-tests = "${libdir}/${BPN}"
FILES_${PN}-dbg += "${libdir}/${BPN}/.debug"
