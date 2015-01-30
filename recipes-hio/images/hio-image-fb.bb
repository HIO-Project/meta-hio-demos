require recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
        hio-version hio-wifi hio-bass hio-eth hio-rc-local hio-image \
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
    packagegroup-fsl-tools-benchmark \
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
    qtquickcontrols-qmlplugins \
    cinematicexperience \
    cairo pango fontconfig freetype pulseaudio dbus \
    alsa-lib alsa-tools alsa-state alsa-utils-alsaconf fsl-alsa-plugins \
    i2c-tools \
"


#LICENSE = "MIT"
export IMAGE_BASENAME = "hio-image-fb"
