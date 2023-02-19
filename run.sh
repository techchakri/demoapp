#!/bin/bash
set -e
$TOMCAT_HOME/bin/startup.sh
tail -f /dev/null