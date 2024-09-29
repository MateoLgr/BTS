# Additional clean files
cmake_minimum_required(VERSION 3.16)

if("${CONFIG}" STREQUAL "" OR "${CONFIG}" STREQUAL "Debug")
  file(REMOVE_RECURSE
  "CMakeFiles\\mediatheque_autogen.dir\\AutogenUsed.txt"
  "CMakeFiles\\mediatheque_autogen.dir\\ParseCache.txt"
  "mediatheque_autogen"
  )
endif()
