# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The reach package"
AUTHOR = "Michael Ripperger <michael.ripperger@swri.org>"
ROS_AUTHOR = "Michael Ripperger <michael.ripperger@swri.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "reach"
ROS_BPN = "reach"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libomp-dev} \
    boost \
    boost-plugin-loader \
    libeigen \
    pcl \
    ros-industrial-cmake-boilerplate \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libomp-dev} \
    boost \
    boost-plugin-loader \
    libeigen \
    pcl \
    ros-industrial-cmake-boilerplate \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-libomp-dev} \
    boost \
    boost-plugin-loader \
    libeigen \
    pcl \
    ros-industrial-cmake-boilerplate \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/reach-release/archive/release/noetic/reach/1.6.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/reach"
SRC_URI = "git://github.com/ros2-gbp/reach-release;${ROS_BRANCH};protocol=https"
SRCREV = "13da932a731031c271ff777e713169630e49a179"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}
