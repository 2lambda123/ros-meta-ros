# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "libpointmatcher is a modular ICP library, useful for robotics and computer vision."
AUTHOR = "Francois Pomerleau <f.pomerleau@gmail.com>"
HOMEPAGE = "https://github.com/ethz-asl/libpointmatcher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=75730354549103aaba72b66caf53717b"

ROS_CN = "libpointmatcher"
ROS_BPN = "libpointmatcher"

ROS_BUILD_DEPENDS = " \
    boost \
    libeigen \
    libnabo \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    catkin \
    libeigen \
    libnabo \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/nobleo/libpointmatcher-release/archive/release/noetic/libpointmatcher/1.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/libpointmatcher"
SRC_URI = "git://github.com/nobleo/libpointmatcher-release;${ROS_BRANCH};protocol=https"
SRCREV = "555a8b700b27252de81234b7bd859c752744adab"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
