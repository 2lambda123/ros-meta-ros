# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The depthai-ros package"
AUTHOR = "sachin <sachin@luxonis.com>"
ROS_AUTHOR = "Sachin Guruswamy"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "depthai-ros"
ROS_BPN = "depthai-ros"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    depthai \
    depthai-bridge \
    depthai-descriptions \
    depthai-examples \
    depthai-filters \
    depthai-ros-driver \
    depthai-ros-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/luxonis/depthai-ros-release/archive/release/noetic/depthai-ros/2.8.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/depthai-ros"
SRC_URI = "git://github.com/luxonis/depthai-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "ea9fc7ad00a7f1d949fba8c76c68079cf6b59eeb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
