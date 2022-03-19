package com.developer.baseandroid.common.extensions

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.transition.Fade
import androidx.transition.Transition
import androidx.transition.TransitionManager

const val ANIMATION_DURATION = 900L
fun View.show() {
    visibility = View.VISIBLE
}

fun View.gone() {
    visibility = View.GONE
}

fun View.showAnimate(parentView: ConstraintLayout) {
    val transition: Transition = Fade()
    transition.duration = ANIMATION_DURATION
    TransitionManager.beginDelayedTransition(parentView, transition)
    visibility = View.VISIBLE
}
fun View.hideAnimate(parentView: ConstraintLayout) {
    val transition: Transition = Fade()
    transition.duration = ANIMATION_DURATION
    TransitionManager.beginDelayedTransition(parentView, transition)
    visibility = View.GONE
}