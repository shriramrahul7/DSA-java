package FastIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Reader {
	BufferedReader br;
	StringTokenizer st;

	public Reader() {
		br = new BufferedReader(new InputStreamReader(System.in));
	}

	public String next() {
		while (st == null || !st.hasMoreElements()) {
			try {

				st = new StringTokenizer(br.readLine());

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return st.nextToken();
	}

	public String nextLine() throws IOException {
		return br.readLine();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(next());
	}

	public long nextLong() throws IOException {
		return Long.parseLong(next());
	}

	// public static void main(String[] args) throws IOException {
	// Reader re = new Reader();
	// System.out.println(re.nextInt());
	// }
}
