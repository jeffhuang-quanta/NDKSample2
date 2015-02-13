LOCAL_PATH := $(call my-dir)

################# mylib1 ##################
include $(CLEAR_VARS)
LOCAL_MODULE    := mylib1
LOCAL_SRC_FILES := main_sample1.c
include $(BUILD_SHARED_LIBRARY)


################# mylib2 ##################
include $(CLEAR_VARS)
LOCAL_MODULE    := mylib2
LOCAL_SRC_FILES := main_sample2.c
include $(BUILD_SHARED_LIBRARY)