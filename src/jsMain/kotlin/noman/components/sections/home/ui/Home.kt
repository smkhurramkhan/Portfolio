package noman.components.sections.home.ui


import androidx.compose.runtime.Composable
import com.varabyte.kobweb.compose.css.FontWeight
import com.varabyte.kobweb.compose.css.ObjectFit
import com.varabyte.kobweb.compose.foundation.layout.Arrangement
import com.varabyte.kobweb.compose.foundation.layout.Box
import com.varabyte.kobweb.compose.foundation.layout.Column
import com.varabyte.kobweb.compose.foundation.layout.Row
import com.varabyte.kobweb.compose.ui.Alignment
import com.varabyte.kobweb.compose.ui.Modifier
import com.varabyte.kobweb.compose.ui.graphics.Colors
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxWidth
import com.varabyte.kobweb.compose.ui.modifiers.fillMaxHeight
import com.varabyte.kobweb.compose.ui.modifiers.animation
import com.varabyte.kobweb.compose.ui.modifiers.fontWeight
import com.varabyte.kobweb.compose.ui.modifiers.id
import com.varabyte.kobweb.compose.ui.modifiers.color
import com.varabyte.kobweb.compose.ui.modifiers.background
import com.varabyte.kobweb.compose.ui.modifiers.backgroundColor
import com.varabyte.kobweb.compose.ui.modifiers.border
import com.varabyte.kobweb.compose.ui.modifiers.borderRadius
import com.varabyte.kobweb.compose.ui.modifiers.bottom
import com.varabyte.kobweb.compose.ui.modifiers.fontSize
import com.varabyte.kobweb.compose.ui.modifiers.gap
import com.varabyte.kobweb.compose.ui.modifiers.height
import com.varabyte.kobweb.compose.ui.modifiers.left
import com.varabyte.kobweb.compose.ui.modifiers.lineHeight
import com.varabyte.kobweb.compose.ui.modifiers.objectFit
import com.varabyte.kobweb.compose.ui.modifiers.position
import com.varabyte.kobweb.compose.ui.modifiers.right
import com.varabyte.kobweb.compose.ui.modifiers.size
import com.varabyte.kobweb.compose.ui.modifiers.top
import com.varabyte.kobweb.compose.ui.modifiers.width
import com.varabyte.kobweb.core.PageContext
import org.jetbrains.compose.web.css.*
import com.varabyte.kobweb.core.rememberPageContext
import com.varabyte.kobweb.silk.components.forms.Button
import com.varabyte.kobweb.silk.components.forms.ButtonSize
import com.varabyte.kobweb.silk.components.graphics.Image
import com.varabyte.kobweb.silk.components.text.SpanText
import com.varabyte.kobweb.silk.style.animation.toAnimation
import com.varabyte.kobweb.silk.style.breakpoint.Breakpoint
import com.varabyte.kobweb.silk.style.toModifier
import com.varabyte.kobweb.silk.theme.breakpoint.rememberBreakpoint
import com.varabyte.kobweb.silk.theme.colors.ColorMode
import noman.SitePalette
import noman.components.sections.home.components.SocialLinksRow
import noman.components.sections.home.style.*
import noman.components.styles.MainButtonStyle
import noman.components.utils.Res
import noman.components.fadeInOnVisible
import noman.components.rememberVisibility
import org.jetbrains.compose.web.css.Color
import org.jetbrains.compose.web.css.px
import org.jetbrains.compose.web.css.s


@Composable
fun Home(currentPalette: SitePalette) {
    val breakpoint = rememberBreakpoint()
    val ctx = rememberPageContext()
    val isDesktop = breakpoint >= Breakpoint.LG

    Row(
        modifier = HeroSectionStyle.toModifier()
            .fillMaxWidth()
            .id("home"),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .weight(1)
                .animation(HeroContainerKeyFrames.toAnimation(duration = 1.5.s)),
            horizontalAlignment = if (isDesktop) Alignment.Start else Alignment.Start,
            verticalArrangement = Arrangement.Center
        ) {

            //  MOBILE ONLY: compact hero layout
            if (!isDesktop) {
                MobileHeroContent(currentPalette = currentPalette, ctx = ctx)
            } else {
                // DESKTOP: original layout
                DesktopHeroContent(
                    currentPalette = currentPalette,
                    ctx = ctx,
                    breakpoint = breakpoint
                )
            }
        }
    }
}

@Composable
fun DesktopHeroContent(
    currentPalette: SitePalette,
    ctx: PageContext,
    breakpoint: Breakpoint
) {
    SpanText(
        text = Res.Constants.GREETING,
        modifier = HelloImStyle.toModifier().fontWeight(FontWeight.Lighter)
    )
    SpanText(
        text = Res.Constants.NAME,
        modifier = UserNameStyle.toModifier()
    )
    SpanText(
        text = Res.Constants.SUB_HEADLINE,
        modifier = UsersMessageStyle.toModifier()
            .color(currentPalette.subHeadLine)
    )
    SocialLinksRow(breakpoint = breakpoint)
    Button(
        onClick = { ctx.router.navigateTo(Res.Constants.RESUME_URL) },
        size = ButtonSize.LG,
        modifier = MainButtonStyle.toModifier()
            .background(currentPalette.buttonBackground)
    ) {
        SpanText(
            text = Res.Constants.RESUME,
            modifier = Modifier.color(currentPalette.buttonText)
        )
    }
}

@Composable
fun MobileHeroContent(
    currentPalette: SitePalette,
    ctx: PageContext,
) {
    val breakpoint = rememberBreakpoint()
    val isVisible = rememberVisibility("home")

    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(0.px)
    ) {

        // Profile image top, centered, reasonable size
        Box(
            modifier = Modifier.fillMaxWidth()
                .fadeInOnVisible(isVisible),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier.position(Position.Relative)
            ) {
                // Outer glow ring
                Box(
                    modifier = Modifier
                        .size(174.px)
                        .borderRadius(50.percent)
                        .border(2.px, LineStyle.Solid, Color("#00e676"))
                        .position(Position.Absolute)
                        .top((-3).px)
                        .left((-3).px)
                )
                // Profile image
                Image(
                    src = "images/main_profile.png",
                    modifier = Modifier
                        .size(168.px)
                        .borderRadius(50.percent)
                        .objectFit(ObjectFit.Cover)
                        .border(3.px, LineStyle.Solid, Color("#0d0d14"))
                )
                // "Available" green dot
                Box(
                    modifier = Modifier
                        .size(16.px)
                        .borderRadius(50.percent)
                        .backgroundColor(Color("#00e676"))
                        .border(2.px, LineStyle.Solid, Color("#0d0d14"))
                        .position(Position.Absolute)
                        .bottom(8.px)
                        .right(8.px)
                )
            }
        }


        //  Greeting
        SpanText(
            text = Res.Constants.GREETING,
            modifier = Modifier
                .fontSize(18.px)
                .fontWeight(FontWeight.Light)
                .color(
                    when (ColorMode.current) {
                        ColorMode.DARK -> Colors.LightGray
                        ColorMode.LIGHT -> Colors.DarkGray
                    }
                )
        )


        //  Name  large, bold, left aligned
        SpanText(
            text = Res.Constants.NAME,
            modifier = Modifier
                .fontSize(36.px)
                .fontWeight(FontWeight.Black)
                .color(
                    when (ColorMode.current) {
                        ColorMode.DARK -> Colors.White
                        ColorMode.LIGHT -> Colors.Black
                    }
                )
                .lineHeight(1.1)
        )


        // Sub-headline with green accent bar on left
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.gap(10.px)
        ) {
            Box(
                modifier = Modifier
                    .width(3.px)
                    .height(20.px)
                    .backgroundColor(Color("#00e676"))
                    .borderRadius(2.px)
            )
            SpanText(
                text = Res.Constants.SUB_HEADLINE,
                modifier = Modifier
                    .fontSize(14.px)
                    .color(currentPalette.subHeadLine)
            )
        }


        //  Social links
        SocialLinksRow(breakpoint = breakpoint)


        //  Resume button full width on mobile
        Button(
            onClick = { ctx.router.navigateTo(Res.Constants.RESUME_URL) },
            size = ButtonSize.LG,
            modifier = MainButtonStyle.toModifier()
                .fillMaxWidth()
                .background(currentPalette.buttonBackground)
        ) {
            SpanText(
                text = Res.Constants.RESUME,
                modifier = Modifier.color(currentPalette.buttonText)
            )
        }
    }
}