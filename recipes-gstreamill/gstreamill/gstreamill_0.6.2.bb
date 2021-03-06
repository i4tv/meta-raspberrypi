DESCRIPTION = "liven encoder based on gstreamer"
SECTION = "base"
HOMEPAGE = "http://github.com/i4tv/gstreamill"
AUTHOR = "Zhang Ping (dqzhangp@163.com)"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

DEPENDS += "gstreamer1.0 gstreamer1.0-plugins-base augeas"

COMPATIBLE_MACHINE = "raspberrypi"

SRCREV = "b460ef75e57db9d5e7a6ab4ab7eefa463f09699e"
SRC_URI = "git://github.com/i4tv/gstreamill.git;protocol=http;branch=master"
S = "${WORKDIR}/git"

inherit autotools pkgconfig

FILES_${PN} = "/usr/bin/gstreamill"
FILES_${PN}-tests = "${libdir}/${BPN}"
FILES_${PN}-dbg += "${libdir}/${BPN}/.debug"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 src/gstreamill ${D}${bindir}
}
