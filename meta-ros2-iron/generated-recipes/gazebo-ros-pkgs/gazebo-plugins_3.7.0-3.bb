# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Robot-independent Gazebo plugins for sensors, motors and dynamic reconfigurable components."
AUTHOR = "Jose Luis Rivero <jrivero@osrfoundation.org>"
ROS_AUTHOR = "John Hsu"
HOMEPAGE = "http://gazebosim.org/tutorials?cat=connect_ros"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "BSD, Apache 2.0"
LICENSE = "BSD-&-Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=f7d4e3a22e6490b133f4eb99348a8124"

ROS_CN = "gazebo_ros_pkgs"
ROS_BPN = "gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    geometry-msgs \
    image-transport \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    geometry-msgs \
    image-transport \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    geometry-msgs \
    image-transport \
    nav-msgs \
    rclcpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-geometry-msgs \
    tf2-ros \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    cv-bridge \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/gazebo_ros_pkgs-release/archive/release/iron/gazebo_plugins/3.7.0-3.tar.gz
ROS_BRANCH ?= "branch=release/iron/gazebo_plugins"
SRC_URI = "git://github.com/ros2-gbp/gazebo_ros_pkgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "b5136776e2094b8cf935885e353ab162eb794857"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
