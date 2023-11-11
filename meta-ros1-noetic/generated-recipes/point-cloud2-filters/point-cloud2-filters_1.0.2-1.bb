# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Filters for the sensor_msgs/PointCloud2 based on the filters and sensor_filters chains"
AUTHOR = "Davide Torielli <toridebraus@gmail.com>"
ROS_AUTHOR = "Davide Torielli <toridebraus@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "point_cloud2_filters"
ROS_BPN = "point_cloud2_filters"

ROS_BUILD_DEPENDS = " \
    filters \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    filters \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    filters \
    pcl-conversions \
    pcl-ros \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ADVRHumanoids/point_cloud2_filters-release/archive/release/noetic/point_cloud2_filters/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/point_cloud2_filters"
SRC_URI = "git://github.com/ADVRHumanoids/point_cloud2_filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "97fe633dd88d1656754971650977ed79d8084800"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
