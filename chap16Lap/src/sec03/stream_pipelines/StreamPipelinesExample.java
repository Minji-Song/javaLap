package sec03.stream_pipelines;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("ȫ�浿", Member.MALE, 30),
				new Member("�質��", Member.FEMALE, 20),
				new Member("�ſ��", Member.MALE, 45),
				new Member("�ڼ���", Member.FEMALE, 27)
		);
		
		double ageAvg =   list.stream()
			// �߰�ó��
				/*
				.filter(new Predicate<Member>() {
					@Override
					public boolean test(Member m) {
						return m.getSex()==Member.MALE;
					}
				})
				*/
			.filter(m -> m.getSex()==Member.MALE)
			/*
			.mapToInt(new ToIntFuction<Member>() {
				@Override
				public int applyAsInt(Member m) {
					return m.getAge();
				}
			})
			*/
			//.mapToInt(m -> m.getAge()) //���ٽ�
			.mapToInt(Member :: getAge) //�Ű������� �޼ҵ� ����
			.average()
			.getAsDouble();
		
		System.out.println("���� ��� ����: " + ageAvg);
	}
}


