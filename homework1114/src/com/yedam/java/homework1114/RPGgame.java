package com.yedam.java.homework1114;

public class RPGgame implements Keypad{

	int mode;
	 //현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 
	 //"RPGgmae 실행"을 출력한다.
	
	public RPGgame() {
		mode=1;
		System.out.println("RPGgmae 실행");
	}
	 
	@Override
	public void leftUpButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 위쪽으로 이동한다");
	}

	@Override
	public void leftDownButton() {
		// TODO Auto-generated method stub
		System.out.println("캐릭터가 아래쪽으로 이동한다");
	}

	@Override
	public void rightUpButton() {
		// TODO Auto-generated method stub
		NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
		- HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
	}

	@Override
	public void rightDownButton() {
		// TODO Auto-generated method stub
		- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
		- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
	}


	@Override
	public void changeMode(int mode) {
		// TODO Auto-generated method stub
		
	switch(mode) {
	case 1:
		System.out.println(HARD_MODE);
		break;
	case 0:
		System.out.println(NORMAL_MODE);
		break;
	}
		
			// TODO Auto-generated method stub
			if(volume > RemoteControl.MAX_VOLUME) {
				this.volume = RemoteControl.MAX_VOLUME;
			}else if(volume < RemoteControl.MIN_VOLUME) {//volum은 0보다 작은 수가 없움,,,그래서 영으로 맞춰조야댕~
				this.volume = RemoteControl.MIN_VOLUME;
			}else {
				this.volume = volume;
			}
			System.out.println("현재 tv 볼륨 :"+ this.volume);
		}
	}
		}
		
		}
	}

	
	