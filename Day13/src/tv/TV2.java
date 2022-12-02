package tv;

public class TV2 {
	// TV클래스를 구성하세요
	
	boolean power;
	int volum;
	int channel;
	boolean mute;
	
	public TV2(boolean power, int volum, int channel, boolean mute) {
		this.power = power;
		this.volum = volum;
		this.channel = channel;
		this.mute = mute;
	}

	
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
		if(power == true) {
			System.out.println("TV On");
		}
	}
	public int getVolum() {
		return volum;
	}
	public void setVolum(int volum) {
		this.volum = volum;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		for(int i = 0; i<10; i++) {
			channel++;			
			System.out.println("채널은 " + channel +"입니다");
		}
		this.channel = channel;
	}
	public boolean isMute() {
		return mute;
	}
	public void setMute(boolean mute) {
		this.mute = mute;
	}
	
	
	// 필드는 속성을 저장합니다 : ex) 전원, 채널, 볼륨, 음소거 상태 등 ...
	// 메서드는 기능을 정의합니다 : 채널 올림/내림, 볼륨 올림/내림, 전원on/off, 음소거 기능 등...
	// 생성자는 객체 생성 시 초기 작동을 담당합니다. (생성된 TV의 초기 채널은 2로 설정한다)
	// 접근제한자는 필드에 대해 private, 메서드에 대해 public을 적용합니다
	// getter / setter는 사용해도 되고, 생략해도 됩니다

}
