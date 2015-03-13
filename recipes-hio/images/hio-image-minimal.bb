include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL_append =" wpa-supplicant wireless-tools nano alsa-lib  alsa-tools alsa-state alsa-utils-alsaconf curl fio iperf openssh-sftp-server hio-version hio-wifi hio-bass  hio-rc-local hio-image  dhcp-client \
"

IMAGE_INSTALL_append = " bluez4 bluez-hcidump python-dbus python-pygobject dbus-glib dbus systemd-compat-units " 
IMAGE_INSTALL_append = " packagegroup-fsl-tools-testapps util-linux  "

#LICENSE = "MIT"

export IMAGE_BASENAME = "hio-image-minimal"
