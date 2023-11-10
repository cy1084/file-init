package com.test.sp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {
	private String name;	//private이어서 외부 접근이 안되기 때문에 getter,setter /@Data-> 상속 받을 땐 사용 불가/@Getter @Setter는 가능
	private String id;
	private String pwd;

}
