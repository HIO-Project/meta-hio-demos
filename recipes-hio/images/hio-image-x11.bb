#include recipes-core/images/core-image-minimal.bb
include recipes-sato/images/core-image-sato.bb

#add test base
IMAGE_INSTALL_append = " iozone3 iperf fio lmbench cpuburn-neon memtester minicom sysstat nmon "
IMAGE_INSTALL_append = " libfslcodec libfslparser libfslvpuwrap "

IMAGE_INSTALL += " \
        wpa-supplicant wireless-tools alsa-lib alsa-tools alsa-utils-alsaconf curl fio iperf \
        hio-version hio-wifi hio-bass hio-rc-local hio-image alsa-state-rt5631 \
"

IMAGE_INSTALL_append = " g++ binutils libstdc++ libstdc++-dev libstdc++-staticdev \
autoconf automake ccache chkconfig glib-networking glibmm \
packagegroup-core-buildessential pkgconfig  \
boost cmake zlib glib-2.0 packagegroup-fsl-tools-testapps git glive \
        ruby \
	gst-plugins-base-app \
 	gst-plugins-base \
	gst-plugins-good \
	gst-plugins-gl-opengl \
	tslib \
	tslib-conf \
	tslib-tests \
	tslib-calibrate \
	xf86-input-tslib \
	openssh-sftp-server \
 	alsa-lib \
	alsa-tools \
	alsa-utils-alsaconf \
	coreutils \
	elfutils-dev \
	enca \
	libfaad \
	fribidi \
	gmp \
	libice \
 	libice-dev \
	libmpc \
	mpfr \
	libsm \
	libsm-dev \
	libx11 \
	libxcalibrate \
	libxext \
	libxinerama \
	libxmu \
	libxt \
	linux-libc-headers-dev \
 	make \
	mkfontdir \
	mkfontscale \
	x11-common-dev \
	xextproto-dev \
	xproto-dev \
	xserver-xorg-dev \
	xserver-xorg-multimedia-modules \
	xserver-xorg-utils \  
 	tar \
	i2c-tools \
	sqlite3 \
	x11vnc \
	libxcb \
	evtest \
	cairo \
	pango \
	fontconfig \
	freetype \
	pulseaudio \
	nano \
	cpufrequtils \
        gdb \
    openssh-sftp-server \
    imx-vpu \
    imx-test \    	
    qtbase-fonts \
    qtbase-plugins \
    qtbase-tools \
    qtbase-examples \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-tools \
    qtdeclarative-examples \
    qtdeclarative-qmlplugins \
    qtmultimedia \
    qtmultimedia-plugins \
    qtmultimedia-examples \
    qtmultimedia-qmlplugins \
    qtsvg \
    qtsvg-plugins \
    qtsensors \
    qtimageformats-plugins \
    qtsystems \
    qtsystems-tools \
    qtsystems-examples \
    qtsystems-qmlplugins \
    qtscript \
    qt3d \
    qt3d-examples \
    qt3d-qmlplugins \
    qt3d-tools \
    qtwebkit \
    qtwebkit-examples-examples \
    qtwebkit-qmlplugins \
    qtgraphicaleffects-qmlplugins \
    qtconnectivity-qmlplugins \
    qtlocation-plugins \
    qtlocation-qmlplugins \
    cinematicexperience \
    cairo pango fontconfig freetype pulseaudio dbus \
    alsa-lib alsa-tools alsa-utils-alsaconf fsl-alsa-plugins \
    i2c-tools \ 
"

#PACKAGECONFIG_append_pn-qtmultimedia = " gstreamer010"
#PACKAGECONFIG_append_pn-qtbase = " sql-sqlite gstreamer gst-plugins-base xcb accessibility pulseaudio gtkstyle"
#IMAGE_INSTALL_append += "pulseaudio-server"

export IMAGE_BASENAME = "hio-image-x11"
