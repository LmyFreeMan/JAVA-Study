package exception_demo;
/**
 * @author Coder
 *
 */
public class Exception_Register extends RuntimeException {
	/**
	 *
	 */
	private static final long serialVersionUID = 1644805913114434501L;
	/**
	 * @param message 抛出异常的信息
	 */
	public Exception_Register(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param message 抛出异常的信息
	 * @param cause   抛出异常的根本原因
	 */
	public Exception_Register(String message, Throwable cause) {
		// TODO Auto-generated constructor stub
		super(message, cause);
	}
	public Exception_Register() {
		// TODO Auto-generated constructor stub
	}
}