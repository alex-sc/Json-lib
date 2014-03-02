package net.sf.json.util;

public class CharSequenceO1 implements CharSequence {
	private final String str;
	private final int firstIndex; 
	private final int strLength;

	public CharSequenceO1(String str, int shift) {
		this.str = str;
		this.firstIndex = shift;
		this.strLength = str.length();
	}

	public CharSequence subSequence(int start, int end) {
		return str.subSequence(start + firstIndex, end + firstIndex);
	}

	public int length() {
		return strLength - firstIndex;
	}

	public char charAt(int idx) {
		return str.charAt(firstIndex + idx);
	}
}
