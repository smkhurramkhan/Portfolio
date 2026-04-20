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
        imageSrc = Res.Images.MEDIC,
        name = "Medic",
        description = "AI health assistant for instant medical insights.",
        tag = "Android App",
        techs = listOf("Kotlin", "Compose", "Firebase", "OpenAI"),
        url = Constants.MEDIC_URL,
        suggestIcon = Res.Images.PLAY_STORE_LOGO,
    ),

    Project(
        imageSrc = Res.Images.WHATS_DELETE,
        name = "WhatsDelete",
        description = "All-in-one chat toolkit to recover messages, save statuses, and enhance messaging.",
        tag = "Android App",
        techs = listOf("Kotlin", "Xml"),
        url = Constants.WHATS_DELETE_URL,
        suggestIcon = Res.Images.PLAY_STORE_LOGO,
    ),

    Project(
        imageSrc = Res.Images.ALL_DOC_READER,
        name = "All Document Reader & Viewer",
        description = "All-in-one document reader to view PDF, Word, Excel, and PowerPoint files easily.",
        tag = "Android App",
        techs = listOf("Kotlin", "Xml"),
        url = Constants.ALL_DOC_READER_URL,
        suggestIcon = Res.Images.PLAY_STORE_LOGO,
    ),

    Project(
        imageSrc = Res.Images.VIDEO_GRAB_PROJECT,
        name = "Video Grab",
        description = "A powerful video and audio downloader for Android.",
        tag = "Android App",
        techs = listOf("Kotlin", "Compose", "yt-dlp"),
        url = Constants.VIDEO_GRAB_URL,
        suggestIcon = Res.Images.GITHUB_LIGHT_LOGO,
    ),
    Project(
        imageSrc = Res.Images.FIREBASE_NOTIFIER,
        name = "Easy Firebase Notifier",
        description = "A lightweight Android library for simplifying Firebase Cloud Messaging (FCM) integration.",
        tag = "Android Library",
        techs = listOf("Kotlin", "Compose", "Firebase"),
        url = Constants.EASY_FIREBASE_NOTIFIER_URL,
        suggestIcon = Res.Images.GITHUB_LIGHT_LOGO,
    ),
    Project(
        imageSrc = Res.Images.IMG_CRAFT,
        name = "ImgCraft",
        description = "An Android image editing library featuring real-time filters and professional-quality rendering.",
        tag = "Android Library",
        techs = listOf("Kotlin", "NDK", "Compose", "xml"),
        url = Constants.IMG_CRAFT_URL,
        suggestIcon = Res.Images.GITHUB_LIGHT_LOGO,
    ),
)