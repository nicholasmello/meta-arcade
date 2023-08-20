# Package summary
SUMMARY = "Build Info with Date and Time"
# License, for example MIT
LICENSE = "MIT"
# License checksum file is always required
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/files/common-licenses/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# buildinfo.c from local file
SRC_URI = "file://buildinfo.cpp"

# Set LDFLAGS options provided by the build system
TARGET_CC_ARCH += "${LDFLAGS}"

# Change source directory to workdirectory where buildinfo.cpp is
S = "${WORKDIR}"

# Compile buildinfo from sources, no Makefile
do_compile() {
    ${CXX} -Wall buildinfo.cpp -o buildinfo
}

# Install binary to final directory /usr/bin
do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${S}/buildinfo ${D}${bindir}
}
