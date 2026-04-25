package noman.components.models

import noman.components.utils.Res


enum class SkillCategory { Languages, ToolsIDEs, Frameworks }


enum class Skill(
    val skillName: String,
    val level: String,
    val iconResLight: String,
    val iconResDark: String,
    val category: SkillCategory,
    val dots: Int,          // how many dots filled (out of 5)
) {
    Kotlin(
        "Kotlin",
        "Skilled",
        Res.Images.KOTLIN_LOGO,
        Res.Images.KOTLIN_LOGO,
        SkillCategory.Languages,
        5
    ),
    Java(
        "Java",
        "Skilled",
        Res.Images.JAVA_LOGO,
        Res.Images.JAVA_LOGO,
        SkillCategory.Languages,
        5
    ),

    Php(
        "PHP",
        "Skilled",
        Res.Images.PHP_LOGO,
        Res.Images.PHP_LOGO,
        SkillCategory.Languages,
        4
    ),

    Node(
        "Node",
        "Adept",
        Res.Images.NODE_LOGO,
        Res.Images.NODE_LOGO,
        SkillCategory.Languages,
        3
    ),
    XMPP(
        "XMPP",
        "Adept",
        Res.Images.XMPP_LOGO,
        Res.Images.XMPP_LOGO,
        SkillCategory.Languages,
        3
    ),
    WEBRTC(
        "WebRTC",
        "Adept",
        Res.Images.WEB_RTC_LOGO,
        Res.Images.WEB_RTC_LOGO,
        SkillCategory.Languages,
        3
    ),

    CPP(
        "C++",
        "Skilled",
        Res.Images.CPP_LOGO,
        Res.Images.CPP_LOGO,
        SkillCategory.Languages,
        4
    ),

    AndroidStudio(
        "Android Studio",
        "Skilled",
        Res.Images.ANDROID_STUDIO_DARK_LOGO,
        Res.Images.ANDROID_STUDIO_LIGHT_LOGO,
        SkillCategory.ToolsIDEs,
        5
    ),
    IntellijIdea(
        "IntelliJ IDEA",
        "Skilled",
        Res.Images.INTELLIJ_IDEA_LOGO,
        Res.Images.INTELLIJ_IDEA_LOGO,
        SkillCategory.ToolsIDEs,
        4
    ),
    Git(
        "Git",
        "Skilled",
        Res.Images.GIT_LOGO,
        Res.Images.GIT_LOGO,
        SkillCategory.ToolsIDEs,
        5
    ),
    Github(
        "GitHub",
        "Skilled",
        Res.Images.GITHUB_DARK_LOGO,
        Res.Images.GITHUB_LIGHT_LOGO,
        SkillCategory.ToolsIDEs,
        5
    ),
    Figma(
        "Figma",
        "Skilled",
        Res.Images.FIGMA_LOGO,
        Res.Images.FIGMA_LOGO,
        SkillCategory.ToolsIDEs,
        4
    ),
    Postman(
        "Postman",
        "Skilled",
        Res.Images.POSTMAN_LOGO,
        Res.Images.POSTMAN_LOGO,
        SkillCategory.ToolsIDEs,
        5
    ),
    Markdown(
        "Markdown",
        "Skilled",
        Res.Images.MARKDOWN_DARK_LOGO,
        Res.Images.MARKDOWN_LIGHT_LOGO,
        SkillCategory.ToolsIDEs,
        4
    ),
    Compose(
        "Compose",
        "Skilled",
        Res.Images.COMPOSE_LOGO,
        Res.Images.COMPOSE_LOGO,
        SkillCategory.Frameworks,
        5
    ),
    Jetpack(
        "Jetpack",
        "Skilled",
        Res.Images.JETPACK_DARK_LOGO,
        Res.Images.JETPACK_LIGHT_LOGO,
        SkillCategory.Frameworks,
        4
    ),
    Firebase(
        "Firebase",
        "Adept",
        Res.Images.FIREBASE_LOGO,
        Res.Images.FIREBASE_LOGO,
        SkillCategory.Frameworks,
        5
    ),
    Gradle(
        "Gradle",
        "Adept",
        Res.Images.GRADLE_DARK_LOGO,
        Res.Images.GRADLE_LIGHT_LOGO,
        SkillCategory.Frameworks,
        4
    ),
    Ktor(
        "Ktor",
        "Adept",
        Res.Images.KTOR_LOGO,
        Res.Images.KTOR_LOGO,
        SkillCategory.Frameworks,
        3
    ),

    KMP(
        "KMP",
        "Adept",
        Res.Images.KMP_LOGO,
        Res.Images.KMP_LOGO,
        SkillCategory.Frameworks,
        3
    ),
}