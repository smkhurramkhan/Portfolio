package noman.components.sections.projects.components

import noman.components.sections.projects.model.Project
import noman.components.utils.Res
import noman.components.utils.Res.Constants

//fun getAllProjects() =
//    listOf(
//        Pair(Res.Images.PROJECT_FOUND_IT, Constants.FOUNT_IT_URL),
//        Pair(Res.Images.PROJECT_RALITH_MILITH, Constants.RALITH_MILITH_URL),
//        Pair(Res.Images.PROJECT_PORTFOLIO, Constants.PORTFOLIO_URL),
//    )


fun getAllProjects() = listOf(
    Project(
        imageSrc = Res.Images.VIDEO_GRAB_PROJECT,
        name = "Video Grab",
        description = "A powerful video and audio downloader for Android.",
        tag = "Android App",
        techs = listOf("Kotlin", "Compose", "yt-dlp"),
        url = Constants.VIDEO_GRAB_URL,
    ),
    Project(
        imageSrc = Res.Images.FIREBASE_NOTIFIER,
        name = "Easy Firebase Notifier",
        description = "A lightweight Android library for simplifying Firebase Cloud Messaging (FCM) integration.",
        tag = "Android Library",
        techs = listOf("Kotlin", "Compose", "Firebase"),
        url = Constants.EASY_FIREBASE_NOTIFIER_URL,
    ),
    Project(
        imageSrc = Res.Images.IMG_CRAFT,
        name = "ImgCraft",
        description = "ImgCraft is a high-performance Android image editing library featuring real-time filters and professional-quality rendering.",
        tag = "Android Library",
        techs = listOf("Kotlin", "NDK", "Compose", "xml"),
        url = Constants.IMG_CRAFT_URL,
    ),
)