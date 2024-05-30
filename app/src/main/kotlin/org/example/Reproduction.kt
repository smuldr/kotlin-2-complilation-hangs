package org.example

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.mapNotNull

class Reproduction {

	private val nullableListFlow = MutableStateFlow<List<String>?>(null)
	
	val listFlow: Flow<List<String>> = nullableListFlow.mapNotNull { it ?: arrayListOf() }
}