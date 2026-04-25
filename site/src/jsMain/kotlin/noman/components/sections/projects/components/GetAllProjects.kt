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
        imageSrc = Res.Images.COMERA,
        name = "Comera",
        description = "Comera is a free-messaging app that allows you to talk to your friends and family via one-to-one chats, voice calls, and video calls",
        tag = "Android App",
        techs = listOf("Kotlin", "Xml","WebRTC","XMPP"),
        url = Constants.COMERA,
        suggestIcon = Res.Images.PLAY_STORE_LOGO,
    ),

    Project(
        imageSrc = Res.Images.JAZZ_DRIVE,
        name = "Jazz Drive",
        description = "Jazz Drive - Secure cloud backup for photos, videos, and files. Access and share anytime.",
        tag = "Android App",
        techs = listOf("Kotlin", "XML"),
        url = Constants.JAZZ_DRIVE,
        suggestIcon = Res.Images.PLAY_STORE_LOGO,
    ),


    Project(
        imageSrc = Res.Images.FIT_FLEX,
        name = "FitFlex",
        description = "Smart workouts, custom plans, and progress tracking to help you get stronger.",
        tag = "Android App",
        techs = listOf("Kotlin","XML"),
        url = Constants.FITFLEX,
        suggestIcon = Res.Images.PLAY_STORE_LOGO,
    ),

    Project(
        imageSrc = Res.Images.FARM_TO_HOME,
        name = "Farm 2 Home",
        description = "Fresh Fruits, Vegetables, Chicken, Meat, Pharmacy and other Grocery items!.",
        tag = "Android App",
        techs = listOf("Kotlin", "Jetpack Compose"),
        url = Constants.FARM_TO_HOME,
        suggestIcon = Res.Images.PLAY_STORE_LOGO,
    ),

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
        imageSrc = Res.Images.LISAX,
        name = "LISA Hockey\n",
        description = "This app is indispensable for parents, players, trainers, coaches and managers.",
        tag = "Android App",
        techs = listOf("Kotlin", "JAVA", "Firebase"),
        url = Constants.LISA_HOCKEY,
        suggestIcon = Res.Images.LISAX,
    )

)