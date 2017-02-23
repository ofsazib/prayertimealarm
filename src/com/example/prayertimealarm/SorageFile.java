package com.example.prayertimealarm;

import java.util.Calendar;

public class SorageFile {
	public static int date, month, year, day, H, M, ID, D;
	public static double ft, zt, at, mt, et, st;
	public static boolean F, Z, A, Mg, E;
	public static String dateString, fazarString, zuhorString, asarString,
			magribString, eashaString, sunString;
	public static String name, monthString, dayString;

	public static void getDistrictname(String string) {
		ft = zt = at = mt = et = st = 0.0;
		name = string;
		showDate();
		findLocalTime(name);
	}

	public static void setvalues(boolean fa, boolean zu, boolean as,
			boolean mg, boolean ea) {
		F = fa;
		Z = zu;
		A = as;
		Mg = mg;
		E = ea;
	}

	public static void getMonth() {
		if (month == 1) {
			January();
		} else if (month == 2) {
			February();
		} else if (month == 3) {
			March();
		} else if (month == 4) {
			April();
		} else if (month == 5) {
			May();
		} else if (month == 6) {
			June();
		} else if (month == 7) {
			July();
		} else if (month == 8) {
			August();
		} else if (month == 9) {
			September();
		} else if (month == 10) {
			October();
		} else if (month == 11) {
			November();
		} else if (month == 12) {
			December();
		}
		// findLocalTime(name);

	}

	public static void showDate() {
		Calendar calender = Calendar.getInstance();
		date = calender.get(Calendar.DATE);
		month = calender.get(Calendar.MONTH) + 1;
		year = calender.get(Calendar.YEAR);
		day = calender.get(Calendar.DAY_OF_WEEK) + 1;
		if (month == 1)
			monthString = "January";
		else if (month == 2)
			monthString = "February";
		else if (month == 3)
			monthString = "March";
		else if (month == 4)
			monthString = "April";
		else if (month == 5)
			monthString = "May";
		else if (month == 6)
			monthString = "June";
		else if (month == 7)
			monthString = "July";
		else if (month == 8)
			monthString = "August";
		else if (month == 9)
			monthString = "September";
		else if (month == 10)
			monthString = "October";
		else if (month == 11)
			monthString = "November";
		else if (month == 12)
			monthString = "December";

		if (day == 1 || day == 8)
			dayString = "Saterday";
		else if (day == 2)
			dayString = "Sunday";
		else if (day == 3)
			dayString = "Monday";
		else if (day == 4)
			dayString = "Tuesday";
		else if (day == 5)
			dayString = "Wednessday";
		else if (day == 6)
			dayString = "Thrusday";
		else if (day == 7)
			dayString = "Friday";

		// getMonth();
	}


	public static void findLocalTime(String name) {

		getMonth();
		if (name == "Chittagong") {
			ft = Minus(ft, 0.03);
			mt = Minus(mt, .06);
			zt = Minus(zt, 0.03);
			at = Minus(at, 0.03);
			st = Minus(st, 0.03);
			et = Minus(et, 0.03);
		} else if (name == "Barisal" || name == "Patuakhali") {
			mt = Minus(mt, 0.02);
		} else if (name == "Noakhali") {
			ft = Minus(ft, 0.02);
			st = Minus(st, 0.02);
			zt = Minus(zt, 0.02);
			at = Minus(at, 0.02);
			mt = Minus(mt, .05);
			et = Minus(et, 0.02);
		} else if (name == "Mymensingh" || name == "Tangail") {
			ft = Minus(ft, 0.01);
			st = Minus(st, 0.01);
			zt = Minus(zt, 0.01);
			at = Minus(at, 0.01);
			mt = Minus(mt, 0.01);
			et = Minus(et, 0.01);
		} else if (name == "Comilla" || name == "Feni") {
			ft = Minus(ft, 0.04);
			st = Minus(st, 0.04);
			zt = Minus(zt, .04);
			at = Minus(at, .04);
			mt = Minus(mt, .04);
			et = Minus(et, .04);
		} else if (name == "Chandpur") {
			ft = Minus(ft, 0.01);
			st = Minus(st, 0.01);
			zt = Minus(zt, .01);
			at = Minus(at, .01);
			mt = Minus(mt, .01);
			et = Minus(et, .01);
		} else if (name == "Sylhet" || name == "Moulvibazar") {
			ft = Minus(ft, 0.05);
			st = Minus(st, 0.05);
			zt = Minus(zt, .07);
			at = Minus(at, .07);
			mt = Minus(mt, .07);
			et = Minus(et, .07);
		} else if (name == "Khulna") {
			ft = Add(ft, 0.05);
			st = Add(st, 0.05);
			zt = Add(zt, 0.02);
			at = Add(at, 0.02);
			mt = Add(mt, 0.02);
			et = Add(et, 0.02);

		} else if (name == "Barisal" || name == "Patuakhali") {
			ft = Add(ft, 0.01);
			st = Add(st, 0.01);

		} else if (name == "Bogra" || name == "Pabna") {
			ft = Add(ft, 0.03);
			st = Add(st, 0.03);
			zt = Add(zt, .03);
			at = Add(at, .03);
			mt = Add(mt, .03);
			et = Add(et, .03);

		} else if (name == "Rangpur") {
			ft = Add(ft, 0.02);
			st = Add(st, 0.02);
			zt = Add(zt, 0.01);
			at = Add(at, 0.01);
			mt = Add(mt, 0.01);
			et = Add(et, 0.01);

		} else if (name == "Dinajpur") {
			ft = Add(ft, 0.06);
			st = Add(st, 0.06);
			zt = Add(zt, 0.07);
			at = Add(at, 0.07);
			mt = Add(mt, 0.07);
			et = Add(et, 0.07);

		} else if (name == "Faridpur" || name == "Jessore" || name == "Kushtia") {
			ft = Add(ft, 0.07);
			st = Add(st, 0.07);
			zt = Add(zt, 0.07);
			at = Add(at, 0.07);
			mt = Add(mt, 0.07);
			et = Add(et, 0.07);

		}

		// getHourMinute();
		Display();
	}

	public static Double Minus(double a, double b) {
		int c;
		double d, e;
		c = (int) a;
		d = a - c;
		e = d + .60 - b;
		if (e < 0.60) {
			return (c + e - 1);
		} else if (e > 0.59) {
			e = e - .60;
			return (c + e);
		}

		return a;
	}

	public static double Add(double a, double b) {
		int c;
		double d;
		c = (int) a;
		d = a - c + b;
		if (d < 0.60) {
			return (a + b);
		} else if (d > 0.59) {
			d = d - .60;
			return (c + 1 + d);
		}
		return a;
	}

	public static void January() {
		if (date < 5) {
			ft = 5.14;
			st = 6.41;
			zt = 12.03;
			at = 3.49;
			mt = 5.30;
			et = 6.46;
		} else if (date < 10) {
			ft = 5.15;
			st = 6.42;
			zt = 12.05;
			at = 3.52;
			mt = 5.33;
			et = 6.49;
		} else if (date < 15) {
			ft = 5.16;
			st = 6.43;
			zt = 12.07;
			at = 3.52;
			mt = 5.36;
			et = 6.52;
		} else if (date < 20) {
			ft = 5.18;
			st = 6.45;
			zt = 12.09;
			at = 3.57;
			mt = 5.38;
			et = 6.54;
		} else if (date < 25) {
			ft = 5.18;
			st = 6.44;
			zt = 12.11;
			at = 4.03;
			mt = 5.43;
			et = 6.58;
		} else if (date <= 31) {
			ft = 5.17;
			st = 6.43;
			zt = 12.12;
			at = 4.06;
			mt = 5.46;
			et = 7.01;
		} else if (date > 31) {
			date = 1;
			month = 2;
			February();
		}

	}

	public static void February() {
		if (date < 5) {
			ft = 5.17;
			st = 6.41;
			zt = 12.14;
			at = 4.11;
			mt = 5.52;
			et = 7.05;
		} else if (date < 10) {
			ft = 5.15;
			st = 6.39;
			zt = 12.14;
			at = 4.13;
			mt = 5.54;
			et = 7.07;
		} else if (date < 15) {
			ft = 5.12;
			st = 6.36;
			zt = 12.14;
			at = 4.16;
			mt = 5.57;
			et = 7.10;
		} else if (date < 20) {
			ft = 5.10;
			st = 6.33;
			zt = 12.14;
			at = 4.18;
			mt = 6.00;
			et = 7.12;
		} else if (date < 25) {
			ft = 5.08;
			st = 6.30;
			zt = 12.14;
			at = 4.20;
			mt = 6.03;
			et = 7.14;
		} else if (date <= 29) {
			ft = 5.04;
			st = 6.26;
			zt = 12.13;
			at = 4.23;
			mt = 6.05;
			et = 7.16;
		} else if (date > 29) {
			date = 1;
			month = 3;
			March();
		}

	}

	public static void March() {
		if (date < 5) {
			ft = 4.58;
			st = 6.20;
			zt = 12.13;
			at = 4.25;
			mt = 6.07;
			et = 7.18;
		} else if (date < 10) {
			ft = 4.57;
			st = 6.19;
			zt = 12.12;
			at = 4.27;
			mt = 6.10;
			et = 7.21;
		} else if (date < 15) {
			ft = 4.53;
			st = 6.15;
			zt = 12.11;
			at = 4.28;
			mt = 6.12;
			et = 7.23;
		} else if (date <20) {
			ft = 4.48;
			st = 6.09;
			zt = 12.09;
			at = 4.28;
			mt = 6.14;
			et = 7.24;
		} else if (date < 25) {
			ft = 4.43;
			st = 6.05;
			zt = 12.06;
			at = 4.30;
			mt = 6.16;
			et = 7.27;
		} else if (date <= 31) {
			ft = 4.38;
			st = 6.56;
			zt = 12.08;
			at = 4.30;
			mt = 6.20;
			et = 7.28;
		} else if (date > 31) {
			date = 1;
			month = 4;
			April();
		}

	}

	public static void April() {
		if (date < 5) {
			ft = 4.30;
			st = 5.53;
			zt = 12.05;
			at = 4.31;
			mt = 6.21;
			et = 7.32;
		} else if (date < 10) {
			ft = 4.26;
			st = 5.49;
			zt = 12.03;
			at = 4.31;
			mt = 6.22;
			et = 7.34;
		} else if (date < 15) {
			ft = 4.21;
			st = 5.45;
			zt = 12.02;
			at = 4.31;
			mt = 6.24;
			et = 7.37;
		} else if (date < 20) {
			ft = 4.15;
			st = 5.40;
			zt = 12.00;
			at = 4.31;
			mt = 6.25;
			et = 7.39;
		} else if (date < 25) {
			ft = 4.11;
			st = 5.36;
			zt = 11.59;
			at = 4.32;
			mt = 6.27;
			et = 7.41;
		} else if (date <= 31) {
			ft = 4.06;
			st = 5.29;
			zt = 11.57;
			at = 4.32;
			mt = 6.29;
			et = 7.44;
		} else if (date > 31) {
			date = 1;
			month = 5;
			May();
		}

	}

	public static void May() {
		if (date < 5) {
			ft = 4.01;
			st = 5.28;
			zt = 11.57;
			at = 4.32;
			mt = 6.31;
			et = 7.47;
		} else if (date < 10) {
			ft = 3.57;
			st = 5.25;
			zt = 11.57;
			at = 4.33;
			mt = 6.34;
			et = 7.51;
		} else if (date < 15) {
			ft = 3.52;
			st = 5.21;
			zt = 11.56;
			at = 4.33;
			mt = 6.36;
			et = 7.54;
		} else if (date < 20) {
			ft = 3.50;
			st = 5.19;
			zt = 11.56;
			at = 4.33;
			mt = 6.38;
			et = 7.56;
		} else if (date < 25) {
			ft = 3.46;
			st = 5.17;
			zt = 11.56;
			at = 4.34;
			mt = 6.40;
			et = 8.00;
		} else if (date <= 30) {
			ft = 3.44;
			st = 5.16;
			zt = 11.57;
			at = 4.35;
			mt = 6.43;
			et = 8.04;
		} else if (date > 30) {
			date = 1;
			month = 6;
			June();
		}

	}

	public static void June() {
		if (date < 5) {
			ft = 3.42;
			st = 5.14;
			zt = 11.57;
			at = 4.37;
			mt = 6.45;
			et = 8.08;
		} else if (date < 10) {
			ft = 3.40;
			st = 5.13;
			zt = 11.58;
			at = 4.37;
			mt = 6.48;
			et = 8.10;
		} else if (date < 15) {
			ft = 3.40;
			st = 5.13;
			zt = 11.59;
			at = 4.38;
			mt = 6.50;
			et = 8.12;
		} else if (date < 20) {
			ft = 3.41;
			st = 5.13;
			zt = 12.00;
			at = 4.39;
			mt = 6.52;
			et = 8.13;
		} else if (date < 25) {
			ft = 3.41;
			st = 5.14;
			zt = 12.01;
			at = 4.40;
			mt = 6.53;
			et = 8.16;
		} else if (date <= 30) {
			ft = 3.41;
			st = 5.15;
			zt = 12.02;
			at = 4.40;
			mt = 6.54;
			et = 8.17;
		} else if (date > 30) {
			date = 1;
			month = 7;
			July();
		}

	}

	public static void July() {
		if (date < 5) {
			ft = 3.43;
			st = 5.17;
			zt = 12.04;
			at = 4.41;
			mt = 6.55;
			et = 8.17;
		} else if (date < 10) {
			ft = 3.45;
			st = 5.19;
			zt = 12.05;
			at = 4.43;
			mt = 6.55;
			et = 8.17;
		} else if (date < 15) {
			ft = 3.47;
			st = 5.21;
			zt = 12.06;
			at = 4.44;
			mt = 6.54;
			et = 8.16;
		} else if (date <20) {
			ft = 3.51;
			st = 5.23;
			zt = 12.06;
			at = 4.44;
			mt = 6.54;
			et = 8.15;
		} else if (date < 25) {
			ft = 3.53;
			st = 5.25;
			zt = 12.06;
			at = 4.44;
			mt = 6.52;
			et = 8.13;
		} else if (date <= 31) {
			ft = 3.56;
			st = 5.27;
			zt = 12.06;
			at = 4.44;
			mt = 6.50;
			et = 8.10;
		} else if (date > 31) {
			date = 1;
			month = 8;
			August();
		}

	}

	public static void August() {
		if (date < 5) {
			ft = 4.01;
			st = 5.30;
			zt = 12.06;
			at = 4.43;
			mt = 6.47;
			et = 8.05;
		} else if (date < 10) {
			ft = 4.03;
			st = 5.32;
			zt = 12.06;
			at = 4.42;
			mt = 6.45;
			et = 8.03;
		} else if (date < 15) {
			ft = 4.06;
			st = 5.34;
			zt = 12.05;
			at = 4.41;
			mt = 6.41;
			et = 7.58;
		} else if (date < 20) {
			ft = 4.09;
			st = 5.35;
			zt = 12.04;
			at = 4.39;
			mt = 6.38;
			et = 7.53;
		} else if (date < 25) {
			ft = 4.11;
			st = 5.37;
			zt = 12.03;
			at = 4.37;
			mt = 6.34;
			et = 7.49;
		} else if (date <= 31) {
			ft = 4.15;
			st = 5.40;
			zt = 12.02;
			at = 4.34;
			mt = 6.29;
			et = 7.43;
		} else if (date > 31) {
			date = 1;
			month = 9;
			September();
		}

	}

	public static void September() {
		if (date < 5) {
			ft = 4.18;
			st = 5.42;
			zt = 12.00;
			at = 4.31;
			mt = 6.23;
			et = 7.36;
		} else if (date < 10) {
			ft = 4.22;
			st = 5.43;
			zt = 11.59;
			at = 4.29;
			mt = 6.20;
			et = 7.32;
		} else if (date < 15) {
			ft = 4.22;
			st = 5.45;
			zt = 11.57;
			at = 4.25;
			mt = 6.14;
			et = 7.26;
		} else if (date < 20) {
			ft = 4.23;
			st = 5.46;
			zt = 11.55;
			at = 4.21;
			mt = 6.09;
			et = 7.21;
		} else if (date < 25) {
			ft = 4.26;
			st = 5.48;
			zt = 11.54;
			at = 4.18;
			mt = 6.05;
			et = 7.16;
		} else if (date <= 30) {
			ft = 4.27;
			st = 5.49;
			zt = 11.52;
			at = 4.14;
			mt = 6.00;
			et = 7.11;
		} else if (date > 30) {
			date = 1;
			month = 10;
			October();
		}

	}

	public static void October() {
		if (date < 5) {
			ft = 4.30;
			st = 5.52;
			zt = 11.50;
			at = 4.09;
			mt = 5.53;
			et = 7.04;
		} else if (date < 10) {
			ft = 4.31;
			st = 5.53;
			zt = 11.49;
			at = 4.04;
			mt = 5.50;
			et = 7.01;
		} else if (date < 15) {
			ft = 4.34;
			st = 5.54;
			zt = 11.48;
			at = 4.04;
			mt = 5.46;
			et = 6.56;
		} else if (date <20) {
			ft = 4.34;
			st = 5.57;
			zt = 11.46;
			at = 3.58;
			mt = 5.39;
			et = 6.51;
		} else if (date < 25) {
			ft = 4.36;
			st = 5.59;
			zt = 11.45;
			at = 3.54;
			mt = 5.36;
			et = 6.48;
		} else if (date <= 31) {
			ft = 4.38;
			st = 6.01;
			zt = 11.44;
			at = 3.50;
			mt = 5.32;
			et = 6.44;
		} else if (date > 31) {
			date = 1;
			month = 11;
			November();
		}

	}

	public static void November() {
		if (date < 5) {
			ft = 4.42;
			st = 6.03;
			zt = 11.44;
			at = 3.47;
			mt = 5.30;
			et = 6.40;
		} else if (date < 10) {
			ft = 4.44;
			st = 6.08;
			zt = 11.44;
			at = 3.45;
			mt = 5.25;
			et = 6.38;
		} else if (date < 15) {
			ft = 4.46;
			st = 6.10;
			zt = 11.44;
			at = 3.42;
			mt = 5.23;
			et = 6.36;
		} else if (date <20) {
			ft = 4.49;
			st = 6.14;
			zt = 11.45;
			at = 3.41;
			mt = 5.21;
			et = 6.34;
		} else if (date < 25) {
			ft = 4.52;
			st = 6.17;
			zt = 11.46;
			at = 3.39;
			mt = 5.20;
			et = 6.34;
		} else if (date <= 30) {
			ft = 4.54;
			st = 6.20;
			zt = 11.47;
			at = 3.38;
			mt = 5.19;
			et = 6.34;
		} else if (date > 30) {
			date = 1;
			month = 12;
			December();
		}

	}

	public static void December() {
		if (date < 5) {
			ft = 4.58;
			st = 6.24;
			zt = 11.49;
			at = 3.38;
			mt = 5.19;
			et = 6.34;
		} else if (date < 10) {
			ft = 5.03;
			st = 6.27;
			zt = 11.51;
			at = 3.38;
			mt = 5.19;
			et = 6.35;
		} else if (date < 15) {
			ft = 5.03;
			st = 6.30;
			zt = 11.53;
			at = 3.39;
			mt = 5.21;
			et = 6.37;
		} else if (date <20) {
			ft = 5.06;
			st = 6.33;
			zt = 11.55;
			at = 3.41;
			mt = 5.22;
			et = 6.38;
		} else if (date < 25) {
			ft = 5.08;
			st = 6.35;
			zt = 11.57;
			at = 3.43;
			mt = 5.24;
			et = 6.40;
		} else if (date <= 31) {
			ft = 5.11;
			st = 6.38;
			zt = 12.00;
			at = 3.46;
			mt = 5.27;
			et = 6.43;
		} else if (date > 31) {
			date = 1;
			month = 1;
			January();
		}

	}

	public String setdates() {
		return " Today is: " + dayString + "  Date: " + date + " "
				+ monthString + " " + year;
	}

	public String setftime() {
		double a, b;
		int ft1, ft2;
		findLocalTime(name);
		a = ft;
		ft1 = (int) a;
		b = ft - ft1;
		b = b * 100;
		ft2 = (int) b;
		if (ft2 < 10) {
			return "Fazar Start  " + ft1 + ":0" + ft2 + " AM";

		} else {
			return "Fazar Start  " + ft1 + ":" + ft2 + " AM";

		}
	}

	public String setztime() {
		String am;
		double a, b;
		int zt1, zt2;
		findLocalTime(name);
		if (zt >= 12.00) {
			am = " PM";
		} else {
			am = " AM";
		}
		a = zt;
		zt1 = (int) a;
		b = zt - zt1;
		b = b * 100;
		zt2 = (int) b;
		if (zt2 < 10) {
			return "Zuhor Start  " + zt1 + ":0" + zt2 + am;

		} else {
			return "Zuhor Start  " + zt1 + ":" + zt2 + am;

		}
	}

	public String setatime() {
		double a, b;
		int at1, at2;
		findLocalTime(name);
		a = at;
		at1 = (int) a;
		b = at - at1;
		b = b * 100;
		at2 = (int) b;
		if (at2 < 10) {
			return "Asar Start  " + at1 + ":0" + at2 + " PM";

		} else {
			return "Asar Start  " + at1 + ":" + at2 + " PM";

		}
	}

	public String setmtime() {
		double a, b;
		int mt1, mt2;
		findLocalTime(name);
		a = mt;
		mt1 = (int) a;
		b = mt - mt1;
		b = b * 100;
		mt2 = (int) b;
		if (mt2 < 10) {
			return "Magrib Start  " + mt1 + ":0" + mt2 + " PM";

		} else {
			return "Magrib Start  " + mt1 + ":" + mt2 + " PM";

		}
	}

	public String setetime() {
		double a, b;
		int et1, et2;
		findLocalTime(name);
		a = et;
		et1 = (int) a;
		b = et - et1;
		b = b * 100;
		et2 = (int) b;
		if (et2 < 10)
			return "Easha Start  " + et1 + ":0" + et2 + " PM";
		// else
		return "Easha Start  " + et1 + ":" + et2 + " PM";
	}

	public String setstime() {
		double a, b;
		int st1, st2;
		findLocalTime(name);
		a = st;
		st1 = (int) a;
		b = st - st1;
		b = b * 100;
		st2 = (int) b;
		if (st2 < 10) {
			return "Sunrise at  " + st1 + ":0" + st2 + " AM";

		} else {
			return "Sunrise at  " + st1 + ":" + st2 + " AM";

		}
	}

	public static void getHourMinute() {
		double a, b, c;
		int ft1, ft2, mt1, mt2, zt1, at1, at2, et1, et2;
		getDistrictname(name);
		// showDate();
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		int din = calendar.get(Calendar.DAY_OF_WEEK);

		a = zt;
		zt1 = (int) a;
		/*
		 * b = zt - zt1; b = b * 100; zt2 = (int) b;
		 */

		a = at;
		at1 = (int) a + 12;
		c = (int) a;
		b = at - c;
		b = b * 100;
		at2 = (int) b;

		a = mt;
		mt1 = (int) a + 12;
		c = (int) a;
		b = mt - c;
		b = b * 100;
		mt2 = (int) b;

		a = et;
		et1 = (int) a + 12;
		c = (int) a;
		b = et - c;
		b = b * 100;
		et2 = (int) b;

		a = ft;
		ft1 = (int) a;
		b = ft - ft1;
		b = b * 100;
		ft2 = (int) b;

		if ((hour < ft1) && (F = true)) {
			H = ft1;
			M = ft2;
			ID = 1;
			D = din;
		} else if ((hour < zt1) && (Z == true)) {
			H = 12;
			M = 45;
			ID = 2;
			D = din;
		} else if ((hour < at1) && (A == true)) {
			int tm = at2 + 10;
			if (tm > 59) {
				H = at1 + 1;
				M = tm - 60;
			} else {
				H = at1;
				M = tm;
			}
			ID = 3;
			D = din;
		} else if ((hour < mt1) && (Mg == true)) {
			H = mt1;
			M = mt2;
			ID = 4;
			D = din;
		} else if ((hour < et1) && (E == true)) {
			int tm = et2 + 15;
			if (tm > 59) {
				H = et1 + 1;
				M = tm - 60;
			} else {
				H = et1;
				M = tm;
			}
			ID = 5;
			D = din;
		} else if ((hour >= et1) && (F == true) || (F == true)) {
			date = calendar.get(Calendar.DATE) + 1;
			// getMonth();
			findLocalTime(name);
			a = ft;
			ft1 = (int) a;
			b = ft - ft1;
			b = b * 100;
			ft2 = (int) b;
			H = ft1;
			M = ft2;
			ID = 1;
			if (din < 6) {
				D = din + 1;
			} else if (din >= 6) {
				D = 0;
			}
		} else if (Z==true) {
			date = calendar.get(Calendar.DATE) + 1;
			// getMonth();
		//	findLocalTime(name);
			H = 12;
			M = 45;
			ID = 2;
			if (din < 6) {
				D = din + 1;
			} else if (din >= 6) {
				D = 0;
			}
		}else if (A==true) {
			date = calendar.get(Calendar.DATE) + 1;
			// getMonth();
			findLocalTime(name);
			int tm = at2 + 10;
			if (tm > 59) {
				H = at1 + 1;
				M = tm - 60;
			} else {
				H = at1;
				M = tm;
			}
			ID = 3;
			if (din < 6) {
				D = din + 1;
			} else if (din >= 6) {
				D = 0;
			}
		}else if (Mg==true) {
			date = calendar.get(Calendar.DATE) + 1;
			// getMonth();
			findLocalTime(name);
			H = mt1;
			M = mt2;
			ID = 4;
			if (din < 6) {
				D = din + 1;
			} else if (din >= 6) {
				D = 0;
			}
		}else if (E==true) {
			date = calendar.get(Calendar.DATE) + 1;
			// getMonth();
			findLocalTime(name);
			int tm = et2 + 15;
			if (tm > 59) {
				H = et1 + 1;
				M = tm - 60;
			} else {
				H = et1;
				M = tm;
			}
			ID = 5;
			if (din < 6) {
				D = din + 1;
			} else if (din >= 6) {
				D = 0;
			}
		}else {
			H = 0;
			M = 0;
		}

	}

	private static void Display() {
		String am;
		double a, b;
		int ft1, ft2, mt1, mt2, st1, st2, zt1, zt2, at1, at2, et1, et2;
		if (zt >= 12.00) {
			am = " PM";
		} else {
			am = " AM";
		}
		a = ft;
		ft1 = (int) a;
		b = ft - ft1;
		b = b * 100;
		ft2 = (int) b;
		if (ft2 < 10) {
			fazarString = "Fazar Start  " + ft1 + ":0" + ft2 + " AM";
			// Alarm(ft1,ft2);
		} else {
			fazarString = "Fazar Start  " + ft1 + ":" + ft2 + " AM";
			// Alarm(ft1,ft2);
		}
		a = zt;
		zt1 = (int) a;
		b = zt - zt1;
		b = b * 100;
		zt2 = (int) b;
		if (zt2 < 10) {
			zuhorString = "Zuhor Start  " + zt1 + ":0" + zt2 + am;

		} else {
			zuhorString = "Zuhor Start  " + zt1 + ":" + zt2 + am;

		}
		a = at;
		at1 = (int) a;
		b = at - at1;
		b = b * 100;
		at2 = (int) b;
		if (at2 < 10) {
			asarString = "Asar Start  " + at1 + ":0" + at2 + " PM";

		} else {
			asarString = "Asar Start " + at1 + ":" + at2 + " PM";

		}
		a = mt;
		mt1 = (int) a;
		b = mt - mt1;
		b = b * 100;
		mt2 = (int) b;
		if (mt2 < 10) {
			magribString = "Magrib Start " + mt1 + ":0" + mt2 + " PM";

		} else {
			magribString = "Magrib Start  " + mt1 + ":" + mt2 + " PM";

		}
		a = et;
		et1 = (int) a;
		b = et - et1;
		b = b * 100;
		et2 = (int) b;
		if (et2 < 10)
			eashaString = "Easha Start  " + et1 + ":0" + et2 + " PM";
		else
			eashaString = "Easha Start  " + et1 + ":" + et2 + " PM";
		a = st;
		st1 = (int) a;
		b = st - st1;
		b = b * 100;
		st2 = (int) b;
		if (st2 < 10) {
			sunString = "Sunrises at  " + st1 + ":0" + st2 + " AM";

		} else {
			sunString = "Sunrises at " + st1 + ":" + st2 + " AM";

		}

	}
}
