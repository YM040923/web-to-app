package com.webtoapp.core.shell

import com.webtoapp.core.activation.ActivationManager
import com.webtoapp.core.adblock.AdBlocker
import com.webtoapp.core.announcement.AnnouncementManager







object ShellRuntimeServices {

    private var shellModeManager: ShellModeManager? = null
    private var activationManager: ActivationManager? = null
    private var announcementManager: AnnouncementManager? = null
    private var adBlocker: AdBlocker? = null

    fun initialize(
        shellModeManager: ShellModeManager,
        activationManager: ActivationManager,
        announcementManager: AnnouncementManager,
        adBlocker: AdBlocker,
    ) {
        this.shellModeManager = shellModeManager
        this.activationManager = activationManager
        this.announcementManager = announcementManager
        this.adBlocker = adBlocker
    }

    fun reset() {
        shellModeManager = null
        activationManager = null
        announcementManager = null
        adBlocker = null
    }

    val shellMode: ShellModeManager
        get() = shellModeManager ?: throw IllegalStateException("ShellRuntimeServices not initialized")

    val activation: ActivationManager
        get() = activationManager ?: throw IllegalStateException("ShellRuntimeServices not initialized")

    val announcement: AnnouncementManager
        get() = announcementManager ?: throw IllegalStateException("ShellRuntimeServices not initialized")

    val adBlock: AdBlocker
        get() = adBlocker ?: throw IllegalStateException("ShellRuntimeServices not initialized")
}