# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "roseus_tutorials"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Manabu Saito"
HOMEPAGE = "http://ros.org/wiki/roseus_tutorials"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_roseus"
ROS_BPN = "roseus_tutorials"

ROS_BUILD_DEPENDS = " \
    roseus \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    checkerboard-detector \
    image-proc \
    image-view2 \
    jsk-recognition-msgs \
    opencv-apps \
    posedetection-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    checkerboard-detector \
    image-proc \
    image-view2 \
    jsk-recognition-msgs \
    opencv-apps \
    posedetection-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    jsk-pcl-ros \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_roseus-release/archive/release/noetic/roseus_tutorials/1.7.5-2.tar.gz
ROS_BRANCH ?= "branch=release/noetic/roseus_tutorials"
SRC_URI = "git://github.com/tork-a/jsk_roseus-release;${ROS_BRANCH};protocol=https"
SRCREV = "7f8c4533cbb4172e9798121473b7e98aa9f142ec"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}