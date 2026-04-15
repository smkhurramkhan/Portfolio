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
        3
    ),
    Java(
        "Java",
        "Adept",
        Res.Images.JAVA_LOGO,
        Res.Images.JAVA_LOGO,
        SkillCategory.Languages,
        2
    ),
    CPP(
        "C++",
        "Skilled",
        Res.Images.CPP_LOGO,
        Res.Images.CPP_LOGO,
        SkillCategory.Languages,
        3
    ),
    AndroidStudio(
        "Android Studio",
        "Skilled",
        Res.Images.ANDROID_STUDIO_DARK_LOGO,
        Res.Images.ANDROID_STUDIO_LIGHT_LOGO,
        SkillCategory.ToolsIDEs,
        3
    ),
    IntellijIdea(
        "IntelliJ IDEA",
        "Skilled",
        Res.Images.INTELLIJ_IDEA_LOGO,
        Res.Images.INTELLIJ_IDEA_LOGO,
        SkillCategory.ToolsIDEs,
        3
    ),
    Git(
        "Git",
        "Skilled",
        Res.Images.GIT_LOGO,
        Res.Images.GIT_LOGO,
        SkillCategory.ToolsIDEs,
        3
    ),
    Github(
        "GitHub",
        "Skilled",
        Res.Images.GITHUB_DARK_LOGO,
        Res.Images.GITHUB_LIGHT_LOGO,
        SkillCategory.ToolsIDEs,
        3
    ),
    Figma(
        "Figma",
        "Adept",
        Res.Images.FIGMA_LOGO,
        Res.Images.FIGMA_LOGO,
        SkillCategory.ToolsIDEs,
        2
    ),
    Postman(
        "Postman",
        "Skilled",
        Res.Images.POSTMAN_LOGO,
        Res.Images.POSTMAN_LOGO,
        SkillCategory.ToolsIDEs,
        3
    ),
    Markdown(
        "Markdown",
        "Adept",
        Res.Images.MARKDOWN_DARK_LOGO,
        Res.Images.MARKDOWN_LIGHT_LOGO,
        SkillCategory.ToolsIDEs,
        2
    ),
    Compose(
        "Compose",
        "Skilled",
        Res.Images.COMPOSE_LOGO,
        Res.Images.COMPOSE_LOGO,
        SkillCategory.Frameworks,
        3
    ),
    Jetpack(
        "Jetpack",
        "Skilled",
        Res.Images.JETPACK_DARK_LOGO,
        Res.Images.JETPACK_LIGHT_LOGO,
        SkillCategory.Frameworks,
        3
    ),
    Firebase(
        "Firebase",
        "Adept",
        Res.Images.FIREBASE_LOGO,
        Res.Images.FIREBASE_LOGO,
        SkillCategory.Frameworks,
        2
    ),
    Gradle(
        "Gradle",
        "Adept",
        Res.Images.GRADLE_DARK_LOGO,
        Res.Images.GRADLE_LIGHT_LOGO,
        SkillCategory.Frameworks,
        2
    ),
    Ktor(
        "Ktor",
        "Novice",
        Res.Images.KTOR_LOGO,
        Res.Images.KTOR_LOGO,
        SkillCategory.Frameworks,
        1
    ),
}