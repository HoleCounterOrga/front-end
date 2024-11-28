package com.hole.counter.domain.targets.repository

interface TargetsRepository{
    suspend fun addTarget()
    suspend fun deleteTarget()
}