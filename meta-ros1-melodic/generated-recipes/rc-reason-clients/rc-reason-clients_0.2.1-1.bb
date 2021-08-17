# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Clients for interfacing with Roboception reason modules on rc_visard and rc_cube."
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
HOMEPAGE = "https://github.com/roboception/rc_reason_clients_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_reason_clients"
ROS_BPN = "rc_reason_clients"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-requests \
    ddynamic-reconfigure-python \
    message-runtime \
    rc-reason-msgs \
    rospy \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-requests \
    ddynamic-reconfigure-python \
    message-runtime \
    rc-reason-msgs \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-requests \
    ddynamic-reconfigure-python \
    message-runtime \
    rc-reason-msgs \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_reason_clients_ros-release/archive/release/melodic/rc_reason_clients/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rc_reason_clients"
SRC_URI = "git://github.com/roboception-gbp/rc_reason_clients_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "55c270e9cfd9fe216581b6dd4ed3e27a8543052d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}