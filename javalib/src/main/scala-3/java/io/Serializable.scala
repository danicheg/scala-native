// Classes defined in this file are registered inside Scala 3 compiler,
// compiling them in javalib would lead to fatal error of compiler. They need
// to be defined with a different name and renamed when generating NIR name

package java.io

trait _Serializable {}
