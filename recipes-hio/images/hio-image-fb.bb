require recipes-core/images/core-image-minimal.bb

#add test base
IMAGE_INSTALL_append = " iozone3 iperf fio lmbench cpuburn-neon memtester minicom sysstat nmon "
IMAGE_INSTALL_append = " libfslcodec libfslparser libfslvpuwrap "

IMAGE_INSTALL += " \
        hio-version hio-wifi hio-bass hio-rc-local hio-image alsa-state-rt5631 \
"

IMAGE_INSTALL_append = " gcc g++ binutils libgcc libgcc-dev libstdc++ libstdc++-dev libstdc++-staticdev \
automake ccache chkconfig glib-networking glibmm \
packagegroup-core-buildessential pkgconfig  \
boost cmake zlib glib-2.0 packagegroup-fsl-tools-testapps git glive \
    firmware-imx-vpu-imx6d \
    wpa-supplicant \
    wireless-tools \
    ruby \
    cpufrequtils \
    nano \
    gdb \
    tar \
    sqlite3 \
    gstreamer \
    gst-meta-video \
    gst-fsl-plugin \
    gst-plugins-base-app \
    gst-plugins-base \
    gst-plugins-good \
    gst-plugins-good-rtsp \
    gst-plugins-good-udp \
    gst-plugins-good-rtpmanager \
    gst-plugins-good-rtp \
    gst-plugins-good-video4linux2 \
    openssh-sftp-server \
    packagegroup-fsl-gstreamer \
    packagegroup-fsl-tools-testapps \
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
PACKAGECONFIG_append_pn-qtmultimedia = " gstreamer010"
PACKAGECONFIG_append_pn-qtbase = " sql-sqlite gstreamer gst-plugins-base accessibility pulseaudio "

#LICENSE = "MIT"
export IMAGE_BASENAME = "hio-image-fb"
