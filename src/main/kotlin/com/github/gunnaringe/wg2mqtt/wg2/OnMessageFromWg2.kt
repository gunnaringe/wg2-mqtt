package com.github.gunnaringe.wg2mqtt.wg2

import com.github.gunnaringe.wg2mqtt.Events
import com.github.gunnaringe.wg2mqtt.model.Event
import com.google.common.eventbus.Subscribe

class OnMessageFromWg2(val callback: (Event) -> Unit) {
    init {
        Events.inbox.register(this)
    }

    @Subscribe
    fun onEvent(event: Event) = callback(event)
}
