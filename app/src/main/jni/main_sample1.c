#include "com_qci_ndksample2_MainActivity.h"

JNIEXPORT jstring JNICALL Java_com_qci_ndksample2_MainActivity_getStringFromJNI1
  (JNIEnv *env, jobject obj)
  {
    return (*env)->NewStringUTF(env,"Hello From NDK sample!");
  }

