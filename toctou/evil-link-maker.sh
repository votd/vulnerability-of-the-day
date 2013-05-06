#!/bin/sh -x

# Delete the old config file
rm config

# Make a symbolic link called config -> evilconfig
ln -s evilconfig config
