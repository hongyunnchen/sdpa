cmd_/home/zzl/ovs/datapath/linux/flex_array.o := gcc -Wp,-MD,/home/zzl/ovs/datapath/linux/.flex_array.o.d  -nostdinc -isystem /usr/lib/gcc/i686-linux-gnu/4.8/include -I/home/zzl/ovs/include -I/home/zzl/ovs/datapath/linux/compat -I/home/zzl/ovs/datapath/linux/compat/include  -I/usr/src/linux-headers-3.11.0-12-generic/arch/x86/include -Iarch/x86/include/generated  -Iinclude -I/usr/src/linux-headers-3.11.0-12-generic/arch/x86/include/uapi -Iarch/x86/include/generated/uapi -I/usr/src/linux-headers-3.11.0-12-generic/include/uapi -Iinclude/generated/uapi -include /usr/src/linux-headers-3.11.0-12-generic/include/linux/kconfig.h -Iubuntu/include  -D__KERNEL__ -Wall -Wundef -Wstrict-prototypes -Wno-trigraphs -fno-strict-aliasing -fno-common -Werror-implicit-function-declaration -Wno-format-security -fno-delete-null-pointer-checks -O2 -m32 -msoft-float -mregparm=3 -freg-struct-return -fno-pic -mpreferred-stack-boundary=2 -march=i686 -mtune=generic -maccumulate-outgoing-args -Wa,-mtune=generic32 -ffreestanding -fstack-protector -DCONFIG_AS_CFI=1 -DCONFIG_AS_CFI_SIGNAL_FRAME=1 -DCONFIG_AS_CFI_SECTIONS=1 -DCONFIG_AS_AVX=1 -DCONFIG_AS_AVX2=1 -pipe -Wno-sign-compare -fno-asynchronous-unwind-tables -mno-sse -mno-mmx -mno-sse2 -mno-3dnow -mno-avx -Wframe-larger-than=1024 -Wno-unused-but-set-variable -fno-omit-frame-pointer -fno-optimize-sibling-calls -pg -Wdeclaration-after-statement -Wno-pointer-sign -fno-strict-overflow -fconserve-stack -DCC_HAVE_ASM_GOTO -DVERSION=\"2.1.2\" -I/home/zzl/ovs/datapath/linux/.. -I/home/zzl/ovs/datapath/linux/.. -g -include /home/zzl/ovs/datapath/linux/kcompat.h  -DMODULE  -D"KBUILD_STR(s)=\#s" -D"KBUILD_BASENAME=KBUILD_STR(flex_array)"  -D"KBUILD_MODNAME=KBUILD_STR(openvswitch)" -c -o /home/zzl/ovs/datapath/linux/.tmp_flex_array.o /home/zzl/ovs/datapath/linux/flex_array.c

source_/home/zzl/ovs/datapath/linux/flex_array.o := /home/zzl/ovs/datapath/linux/flex_array.c

deps_/home/zzl/ovs/datapath/linux/flex_array.o := \
  /home/zzl/ovs/datapath/linux/kcompat.h \
  include/generated/uapi/linux/version.h \

/home/zzl/ovs/datapath/linux/flex_array.o: $(deps_/home/zzl/ovs/datapath/linux/flex_array.o)

$(deps_/home/zzl/ovs/datapath/linux/flex_array.o):
