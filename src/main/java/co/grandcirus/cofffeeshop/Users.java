package co.grandcirus.cofffeeshop;

public class Users {

		private long id;
		private String firstName;
		private String lastName;
		private String email;
		private int phoneNumber;
		private String password;

		public Users(long id, String firstName, String lastName, String email, int phoneNumber, String password) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.phoneNumber = phoneNumber;
			this.password = password;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public int getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(int phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		@Override
		public String toString() {
			return "Users [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
					+ ", phoneNumber=" + phoneNumber + ", password=" + password + "]";
		}

		
		

	}
