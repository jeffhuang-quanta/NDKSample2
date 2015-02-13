#include "com_qci_ndksample2_MainActivity2.h"

JNIEXPORT jstring JNICALL Java_com_qci_ndksample2_MainActivity2_getStringFromJNI2
  (JNIEnv *env, jobject obj)
  {
    return (*env)->NewStringUTF(env,"Hello From NDK sample again!");
  }

