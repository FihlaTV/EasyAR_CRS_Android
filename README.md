# EasyAR_CRS_Android
EasyAR Basic 在Android端实现CRS云识别功能

## EasyAR & EasyAR CRS
[EasyAR SDK](https://www.easyar.cn/view/sdk.html)是AR（Augmented Reality，增强现实）引擎，让AR更加简单，让AR更加普遍！

[EasyAR CRS](https://www.easyar.cn/view/crs.html)是EasyAR Cloud Recognition Service的简称，也称EasyAR云识别服务,是EasyAR提供的基于云端的图像识别检索服务，包括图像目标云端检索功能和图像目标管理功能。

而CRS是一个持续收费功能(每月599元)，本项目将演示如何利用EasySDK实现一个具备类似云识别功能的App。

## 核心原理
1. 被识别的图片[ImageTarget](https://www.easyar.cn/doc/EasyAR%20SDK/API%20Reference/2.0/ImageTarget.html)
在setup指定路径[StorageType](https://www.easyar.cn/doc/EasyAR%20SDK/API%20Reference/2.0/StorageType.html)的时候，
不仅仅支持官方demo中的assets目录，同时支持程序持久化数据目录(App)，而这个目录是程序可以读写的。也就是可以自己将被识别的图片吓到到持续化数据目录中。

2. 同上，识别后播放的视频[VideoPlayer](https://www.easyar.cn/doc/EasyAR%20SDK/API%20Reference/2.0/VideoPlayer.html)播放器，播放视频的路径除了demo中提到的assets目录和在线url地址
同时支持持久化数据目录(App)

## 工程
工程是基于EasyAR_SDK_2.1.0_Basic_Samples_Android中的HelloARVideo工程

## Demo
[FIR](http://fir.im/EasyARCRS)

## License
EasyAR SDK和EasyAR CRS相关代码及商标等版权都归原版权方所有，本项目只是对其的封装和使用。

其余代码版权[Apache 2.0](https://github.com/zhangchaoxu/backbone-android/blob/master/LICENSE)

