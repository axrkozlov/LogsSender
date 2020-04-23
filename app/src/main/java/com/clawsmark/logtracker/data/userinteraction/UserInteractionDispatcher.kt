package com.clawsmark.logtracker.data.userinteraction

abstract class UserInteractionDispatcher{
    abstract fun onInteraction()

    abstract fun addObserver(userInteractionObserver: UserInteractionObserver)
    abstract fun removeObserver(userInteractionObserver: UserInteractionObserver)

    protected abstract fun dispatchInteraction()
    protected abstract fun dispatchIdle()

}