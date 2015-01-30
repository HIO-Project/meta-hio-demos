include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
	wpa-supplicant wireless-tools alsa-lib alsa-tools alsa-state alsa-utils-alsaconf curl fio iperf openssh-sftp-server \
        hio-version hio-wifi hio-bass hio-eth hio-rc-local hio-image \
"

#LICENSE = "MIT"
export IMAGE_BASENAME = "hio-image-minimal"
