package structural_patterns.composite;

import java.util.Optional;

public class DemoComposite {

	public static void main(String[] args) {
		Folder folderA = new Folder("folder_a");
		folderA.addChild(new File("file_a"));
		Folder folderB = new Folder("folder_b");
		folderA.addChild(folderB);
		folderB.addChild(new File("file_b"));

		checkIsFind("dummy", folderA);
		checkIsFind("file_a", folderA);
		checkIsFind("file_b", folderA);
	}

	private static void checkIsFind(String name, Component root) {
		Optional<Component> component = root.searchBy(name);

		component.ifPresentOrElse(
				c -> System.out.println("Файл:" + name + " найден"),
				() -> System.out.println("Файл:" + name + " не найден")
		);
	}

}
