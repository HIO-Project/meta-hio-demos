include recipes-core/images/core-image-minimal.bb

#add test base
IMAGE_INSTALL_append = " iozone3 iperf fio lmbench cpuburn-neon memtester minicom sysstat nmon "
IMAGE_INSTALL_append = " libfslcodec libfslparser libfslvpuwrap "

IMAGE_INSTALL_append =" wpa-supplicant wireless-tools nano alsa-lib  alsa-tools alsa-utils-alsaconf curl fio iperf openssh-sftp-server hio-version hio-wifi hio-bass  hio-rc-local hio-image  dhcp-client alsa-state-rt5631 \
"

IMAGE_INSTALL_append = " bluez4 bluez-hcidump python-dbus python-pygobject dbus-glib dbus systemd-compat-units " 
IMAGE_INSTALL_append = " packagegroup-fsl-tools-testapps util-linux  "

#LICENSE = "MIT"

export IMAGE_BASENAME = "hio-image-minimal"
